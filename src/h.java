public final class h extends DrawingArea {
	
	public byte aga[];
	public int agb[];
	public int agc;
	public int agd;
	public int age;
	public int agf;
	public int agg;
	public int agh;

	public h(o arg0, String arg1, int arg2) {
		j j1 = new j(arg0.abl(arg1 + ".dat", null));
		j j2 = new j(arg0.abl("index.dat", null));
		j2.ala = j1.aik();
		agg = j2.aik();
		agh = j2.aik();
		int i = j2.aii();
		agb = new int[i];
		for (int k = 0; k < i - 1; k++)
			agb[k + 1] = j2.aim();

		for (int l = 0; l < arg2; l++) {
			j2.ala += 2;
			j1.ala += j2.aik() * j2.aik();
			j2.ala++;
		}

		age = j2.aii();
		agf = j2.aii();
		agc = j2.aik();
		agd = j2.aik();
		int i1 = j2.aii();
		int k1 = agc * agd;
		aga = new byte[k1];
		if (i1 == 0) {
			for (int l1 = 0; l1 < k1; l1++)
				aga[l1] = j1.aij();

		} else if (i1 == 1) {
			for (int i2 = 0; i2 < agc; i2++) {
				for (int k2 = 0; k2 < agd; k2++)
					aga[i2 + k2 * agc] = j1.aij();

			}
		}
	}

	public void acc(int arg0, int arg1, int arg2, int arg3) {
		try {
			int i = agc;
			int k = agd;
			int l = 0;
			int i1 = 0;
			int j1 = (i << 16) / arg2;
			int k1 = (k << 16) / arg3;
			int l1 = agg;
			int i2 = agh;
			j1 = (l1 << 16) / arg2;
			k1 = (i2 << 16) / arg3;
			arg0 += ((age * arg2 + l1) - 1) / l1;
			arg1 += ((agf * arg3 + i2) - 1) / i2;
			if ((age * arg2) % l1 != 0)
				l = (l1 - (age * arg2) % l1 << 16) / arg2;
			if ((agf * arg3) % i2 != 0)
				i1 = (i2 - (agf * arg3) % i2 << 16) / arg3;
			arg2 = (arg2 * (agc - (l >> 16))) / l1;
			arg3 = (arg3 * (agd - (i1 >> 16))) / i2;
			int j2 = arg0 + arg1 * DrawingArea.bbf;
			int k2 = DrawingArea.bbf - arg2;
			if (arg1 < DrawingArea.bbh) {
				int l2 = DrawingArea.bbh - arg1;
				arg3 -= l2;
				arg1 = 0;
				j2 += l2 * DrawingArea.bbf;
				i1 += k1 * l2;
			}
			if (arg1 + arg3 > DrawingArea.bbi)
				arg3 -= (arg1 + arg3) - DrawingArea.bbi;
			if (arg0 < DrawingArea.bbj) {
				int i3 = DrawingArea.bbj - arg0;
				arg2 -= i3;
				arg0 = 0;
				j2 += i3;
				l += j1 * i3;
				k2 += i3;
			}
			if (arg0 + arg2 > DrawingArea.bbk) {
				int j3 = (arg0 + arg2) - DrawingArea.bbk;
				arg2 -= j3;
				k2 += j3;
			}
			acd(DrawingArea.bbe, aga, agb, l, i1, j2, k2, arg2, arg3, j1, k1, i);
		} catch (Exception exception) {
			System.out.println("error in sprite clipping routine");
		}
	}

	private void acd(int arg0[], byte arg1[], int arg2[], int arg3, int arg4,
			int arg5, int arg6, int arg7, int arg8, int arg9, int arg10,
			int arg11) {
		try {
			int i = arg3;
			for (int k = -arg8; k < 0; k++) {
				int l = (arg4 >> 16) * arg11;
				for (int i1 = -arg7; i1 < 0; i1++) {
					byte byte0 = arg1[(arg3 >> 16) + l];
					if (byte0 != 0)
						arg0[arg5++] = arg2[byte0 & 0xff];
					else
						arg5++;
					arg3 += arg9;
				}

				arg4 += arg10;
				arg3 = i;
				arg5 += arg6;
			}
		} catch (Exception exception) {
			System.out.println("error in plot_scale");
		}
	}
}
