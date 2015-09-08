public class DrawingArea extends d {

	public static void drawHorizontal(int x, int y, int length, int color) {
		if (y < bbh || y >= bbi)
			return;
		if (x < bbj) {
			length -= bbj - x;
			x = bbj;
		}
		if (x + length > bbk)
			length = bbk - x;
		int pixelIndex = x + y * bbf;
		for (int pixelOffset = 0; pixelOffset < length; pixelOffset++)
			bbe[pixelIndex + pixelOffset] = color;

	}

	public static void aje(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < bbj || arg0 >= bbk)
			return;
		if (arg1 < bbh) {
			arg2 -= bbh - arg1;
			arg1 = bbh;
		}
		if (arg1 + arg2 > bbi)
			arg2 = bbi - arg1;
		int i = arg0 + arg1 * bbf;
		for (int j = 0; j < arg2; j++)
			bbe[i + j * bbf] = arg3;

	}

	public static void ajg(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0)
			arg0 = 0;
		if (arg1 < 0)
			arg1 = 0;
		if (arg2 > bbf)
			arg2 = bbf;
		if (arg3 > bbg)
			arg3 = bbg;
		bbj = arg0;
		bbh = arg1;
		bbk = arg2;
		bbi = arg3;
		bbl = bbk - 1;
		bbm = bbk / 2;
		bbn = bbi / 2;
	}

	public static void ajh(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		if (arg0 < bbj) {
			arg2 -= bbj - arg0;
			arg0 = bbj;
		}
		if (arg1 < bbh) {
			arg3 -= bbh - arg1;
			arg1 = bbh;
		}
		if (arg0 + arg2 > bbk)
			arg2 = bbk - arg0;
		if (arg1 + arg3 > bbi)
			arg3 = bbi - arg1;
		int i = 256 - arg5;
		int j = (arg4 >> 16 & 0xff) * arg5;
		int k = (arg4 >> 8 & 0xff) * arg5;
		int l = (arg4 & 0xff) * arg5;
		int l1 = bbf - arg2;
		int i2 = arg0 + arg1 * bbf;
		for (int j2 = 0; j2 < arg3; j2++) {
			for (int k2 = -arg2; k2 < 0; k2++) {
				int i1 = (bbe[i2] >> 16 & 0xff) * i;
				int j1 = (bbe[i2] >> 8 & 0xff) * i;
				int k1 = (bbe[i2] & 0xff) * i;
				int l2 = ((j + i1 >> 8) << 16) + ((k + j1 >> 8) << 8)
						+ (l + k1 >> 8);
				bbe[i2++] = l2;
			}

			i2 += l1;
		}

	}

	public static void aji(int arg0, int arg1, int arg2, int arg3, int arg4) {
		drawHorizontal(arg0, arg1, arg2, arg4);
		drawHorizontal(arg0, (arg1 + arg3) - 1, arg2, arg4);
		aje(arg0, arg1, arg3, arg4);
		aje((arg0 + arg2) - 1, arg1, arg3, arg4);
	}

	public static void setArea(int arg0[], int arg1, int arg2) {
		bbe = arg0;
		bbf = arg1;
		bbg = arg2;
		ajg(0, 0, arg1, arg2);
	}

	public static void ajl(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < bbj) {
			arg2 -= bbj - arg0;
			arg0 = bbj;
		}
		if (arg1 < bbh) {
			arg3 -= bbh - arg1;
			arg1 = bbh;
		}
		if (arg0 + arg2 > bbk)
			arg2 = bbk - arg0;
		if (arg1 + arg3 > bbi)
			arg3 = bbi - arg1;
		int i = bbf - arg2;
		boolean flag = true;
		int j = arg0 + arg1 * bbf;
		for (int index = -arg3; index < 0; index++) {
			for (int l = -arg2; l < 0; l++)
				bbe[j++] = arg4;

			j += i;
		}

	}

	public static void ajm() {
		int i = bbf * bbg;
		for (int j = 0; j < i; j++)
			bbe[j] = 0;
	}

	public static void ajn(int arg0, int arg1, int arg2, int arg3, int arg4) {
		int i = 256 - arg4;
		int j = (arg3 >> 16 & 0xff) * arg4;
		int k = (arg3 >> 8 & 0xff) * arg4;
		int l = (arg3 & 0xff) * arg4;
		int l1 = arg1 - arg2;
		if (l1 < 0)
			l1 = 0;
		int i2 = arg1 + arg2;
		if (i2 >= bbg)
			i2 = bbg - 1;
		for (int j2 = l1; j2 <= i2; j2++) {
			int k2 = j2 - arg1;
			int l2 = (int) Math.sqrt(arg2 * arg2 - k2 * k2);
			int i3 = arg0 - l2;
			if (i3 < 0)
				i3 = 0;
			int j3 = arg0 + l2;
			if (j3 >= bbf)
				j3 = bbf - 1;
			int k3 = i3 + j2 * bbf;
			for (int l3 = i3; l3 <= j3; l3++) {
				int i1 = (bbe[k3] >> 16 & 0xff) * i;
				int j1 = (bbe[k3] >> 8 & 0xff) * i;
				int k1 = (bbe[k3] & 0xff) * i;
				int i4 = ((j + i1 >> 8) << 16) + ((k + j1 >> 8) << 8)
						+ (l + k1 >> 8);
				bbe[k3++] = i4;
			}
		}
	}

	public static int bbe[];
	public static int bbf;
	public static int bbg;
	public static int bbh = 0;
	public static int bbi = 0;
	public static int bbj = 0;
	public static int bbk = 0;
	public static int bbl;
	public static int bbm;
	public static int bbn;
	public static int bca;

}
