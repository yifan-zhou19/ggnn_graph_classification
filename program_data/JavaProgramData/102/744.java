package <missing>;

public class GlobalMembers
{
	public static int cmp(Object x, Object y)
	{
		return *(float)x > (float)y?1:-1;
	}
	public static int Main()
	{
	   // ifstream if1("e:\\input1.txt");
		int n;
		int ptra = 0;
		int ptrb = 0;
		float[] a = new float[40];
		float[] b = new float[40];
		String s = new String(new char[10]);
	//	if1>>n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		//	if1>>s;
			if (s.charAt(0) == 'm')
			{
				a[ptra++] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			}
		//	if1>>a[ptra++];
			else
			{
				b[ptrb++] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			}
		//	if1>>b[ptrb++];
		}
		qsort(a,ptra,(Float.SIZE / Byte.SIZE),cmp);
		qsort(b,ptrb,(Float.SIZE / Byte.SIZE),cmp);
		for (int j = 0;j < ptra;j++)
		{
		//	cout<<setprecision(3)<<a[j]<<" ";
			System.out.printf("%.2f ",a[j]);
		}
		for (int k = ptrb - 1;k > 0;k--)
		{
		//	cout<<setprecision(3)<<b[k]<<" ";
			System.out.printf("%.2f ",b[k]);
		}
	//	cout<<setprecision(3)<<b[0];
				System.out.printf("%.2f",b[0]);
		return 0;
	}
}

