import java.util.Random;

public final class i extends DrawingArea {
	
	byte ahk[][];
	int ahl[];
	int ahm[];
	int ahn[];
	int aia[];
	public int aib[];
	public int aic;
	Random aid;
	boolean aie;

	public int adm(String arg0) {
		if (arg0 == null)
			return 0;
		int k = 0;
		for (int l = 0; l < arg0.length(); l++)
			k += aib[arg0.charAt(l)];
		return k;
	}

	public void adn(String arg0, int arg1, int arg2, int arg3) {
		if (arg0 == null)
			return;
		arg2 -= aic;
		for (int k = 0; k < arg0.length(); k++) {
			char c1 = arg0.charAt(k);
			if (c1 != ' ')
				aed(ahk[c1], arg1 + ahn[c1], arg2 + aia[c1], ahl[c1], ahm[c1],
						arg3);
			arg1 += aib[c1];
		}
	}

	public i(Archive arg0, String arg1, boolean arg2) {
		ahk = new byte[256][];
		ahl = new int[256];
		ahm = new int[256];
		ahn = new int[256];
		aia = new int[256];
		aib = new int[256];
		aic = 0;
		aid = new Random();
		aie = false;
		RSBuffer j1 = new RSBuffer(arg0.abl(arg1 + ".dat", null));
		RSBuffer j2 = new RSBuffer(arg0.abl("index.dat", null));
		byte byte0 = -1;
		j2.ala = j1.aik() + 4;
		int l = j2.aii();
		if (l > 0)
			j2.ala += 3 * (l - 1);
		for (int i1 = 0; i1 < 256; i1++) {
			int k = i1;
			ahn[i1] = j2.aii();
			aia[i1] = j2.aii();
			int k1 = ahl[i1] = j2.aik();
			int l1 = ahm[i1] = j2.aik();
			int i2 = j2.aii();
			int k2 = k1 * l1;
			ahk[i1] = new byte[k2];
			if (i2 == 0) {
				for (int l2 = 0; l2 < k2; l2++)
					ahk[i1][l2] = j1.aij();

			} else if (i2 == 1) {
				for (int i3 = 0; i3 < k1; i3++) {
					for (int k3 = 0; k3 < l1; k3++)
						ahk[i1][i3 + k3 * k1] = j1.aij();

				}

			}
			if (l1 > aic && i1 < 128)
				aic = l1;
			ahn[i1] = 1;
			aib[i1] = k1 + 2;
			int j3 = 0;
			for (int l3 = l1 / 7; l3 < l1; l3++)
				j3 += ahk[i1][l3 * k1];

			if (j3 <= l1 / 7) {
				aib[i1]--;
				ahn[i1] = 0;
			}
			j3 = 0;
			for (int i4 = l1 / 7; i4 < l1; i4++)
				j3 += ahk[i1][(k1 - 1) + i4 * k1];

			if (j3 <= l1 / 7)
				aib[i1]--;
		}

		if (arg2)
			aib[32] = aib[73];
		else
			aib[32] = aib[105];
	}

	public void aeb(String arg0, int arg1, int arg2, int arg3) {
		adn(arg0, arg1 - adm(arg0), arg2, arg3);
	}

	public void aec(String arg0, int arg1, int arg2, int arg3) {
		adn(arg0, arg1 - adm(arg0) / 2, arg2, arg3);
	}

	private void aed(byte arg0[], int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		int k = arg1 + arg2 * DrawingArea.bbf;
		int l = DrawingArea.bbf - arg3;
		int i1 = 0;
		int j1 = 0;
		if (arg2 < DrawingArea.bbh) {
			int k1 = DrawingArea.bbh - arg2;
			arg4 -= k1;
			arg2 = DrawingArea.bbh;
			j1 += k1 * arg3;
			k += k1 * DrawingArea.bbf;
		}
		if (arg2 + arg4 >= DrawingArea.bbi)
			arg4 -= ((arg2 + arg4) - DrawingArea.bbi) + 1;
		if (arg1 < DrawingArea.bbj) {
			int l1 = DrawingArea.bbj - arg1;
			arg3 -= l1;
			arg1 = DrawingArea.bbj;
			j1 += l1;
			k += l1;
			i1 += l1;
			l += l1;
		}
		if (arg1 + arg3 >= DrawingArea.bbk) {
			int i2 = ((arg1 + arg3) - DrawingArea.bbk) + 1;
			arg3 -= i2;
			i1 += i2;
			l += i2;
		}
		if (arg3 <= 0 || arg4 <= 0) {
			return;
		} else {
			aee(DrawingArea.bbe, arg0, arg5, j1, k, arg3, arg4, l, i1);
			return;
		}
	}

	private void aee(int arg0[], byte arg1[], int arg2, int arg3, int arg4,
			int arg5, int arg6, int arg7, int arg8) {
		int k = -(arg5 >> 2);
		arg5 = -(arg5 & 3);
		for (int l = -arg6; l < 0; l++) {
			for (int i1 = k; i1 < 0; i1++) {
				if (arg1[arg3++] != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				if (arg1[arg3++] != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				if (arg1[arg3++] != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
				if (arg1[arg3++] != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;
			}

			for (int j1 = arg5; j1 < 0; j1++)
				if (arg1[arg3++] != 0)
					arg0[arg4++] = arg2;
				else
					arg4++;

			arg4 += arg7;
			arg3 += arg8;
		}
	}
}
