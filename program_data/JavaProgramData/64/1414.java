package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //??n
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float[] a = new float[100]; //??????a,b,c,???????????t
		float[] b = new float[100];
		float[] c = new float[100];
		float[] s = new float[100];
		float t;
		int i; //???????????d,e
		int l;
		int m;
		int p = 0;
		int j;
		int k;
		int q;
		int x;
		int[] d = new int[100];
		int[] e = new int[100];
		for (i = 0;i < n;i++)
		{
			a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			c[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		for (l = 0;l < n - 1;l++)
		{
			 for (m = l + 1;m < n;m++)
			 {
				 s[p] = Math.sqrt((a[l] - a[m]) * (a[l] - a[m]) + (b[l] - b[m]) * (b[l] - b[m]) + (c[l] - c[m]) * (c[l] - c[m])); //????
				 d[p] = l; //???????????
				 e[p] = m;
				 p++;
			 }
		}
		for (j = 0;j < p - 1;j++)
		{
			for (k = j + 1;k < p;k++)
			{
				if (s[k] > s[j]) //????????
				{
				   t = s[k];
				   s[k] = s[j];
				   s[j] = t;
				   q = d[k];
				   d[k] = d[j]; //???????
				   d[j] = q;
				   q = e[k];
				   e[k] = e[j];
				   e[j] = q;
				}
				if (s[k] == s[j])
				{
					if (d[j] > d[k] || e[j] > e[k]) //??????????????????
					{
						  q = d[k];
						  d[k] = d[j];
						  d[j] = q;
						  q = e[k];
						  e[k] = e[j];
						  e[j] = q;
					}
				}
			}
		}
		for (x = 0;x < p;x++)
		{
			System.out.print("(");
			System.out.print(a[d[x]]);
			System.out.print(",");
			System.out.print(b[d[x]]);
			System.out.print(",");
			System.out.print(c[d[x]]);
			System.out.print(")-(");
			System.out.print(a[e[x]]);
			System.out.print(",");
			System.out.print(b[e[x]]);
			System.out.print(",");
			System.out.print(c[e[x]]);
			System.out.print(")=");
			System.out.printf("%.2f\n",s[x]); //??
		}
		return 0;
	}

}

