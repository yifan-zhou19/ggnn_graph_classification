package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long int n,j,i,len,b[500]={0},a[501]={0},c=0,max=0,m[500]={0},t=0,g=0,z=0;
		int n;
		int j;
		int i;
		int len;
		int[] b = new int[500];
		int[] a = new int[501];
		int c = 0;
		int max = 0;
		int[] m = new int[500];
		int t = 0;
		int g = 0;
		int z = 0;
		final String s = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		len = s.length();
		for (i = 0;i <= len - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i] = (a + i) * 100 + *(s.Substring(j) + i) - 32;
			}
		}
		for (i = 0;i < len - n + 1;i++)
		{
			for (j = 0;j < len - n + 1;j++)
			{
			if (a[i] == a[j])
			{
					b[i]++;
			}
			}
		}
		for (i = 0;i < len - n + 1;i++)
		{
			if (b[i] > 1)
			{
				c = 1;
			}
		}
		if (c == 0)
		{
			System.out.print("NO");
		}
			 else
			 {
		for (g = 0;g < len - n + 1;g++)
		{
			if (b[g] > max)
			{
			max = b[g];
			}
		}
			z = 0;
		for (i = 0;i < len - n + 1;i++)
		{
				if (b[i] == max)
				{
				 z = 0;
				for (j = 0;j < t && i != m[j];j++)
				{
				if (a[i] == a[m[j]])
				{
					z = 1;
				}
				}
			if (z == 0)
			{
				m[t] = i;
			t++;
			}
				}
		}

		System.out.printf("%d\n",max);
		for (j = 0;j < t;j++)
		{
			for (i = 0;i < n;i++)
			{
			System.out.printf("%c",s.charAt(i + m[j]));
			}
		System.out.print("\n");
		}
			 }
	}
}

