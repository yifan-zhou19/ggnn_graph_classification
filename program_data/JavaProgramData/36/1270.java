package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[256];
		int n;
		int i;
		int j;
		int c1;
		int c2;
		int c3;
		int c4;
		int k;
		float d;
		String s1 = new String(new char[200]);
		String s2 = new String(new char[200]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		c1 = s1.length();
		c2 = s2.length();
		for (i = 0;i < c1;i++)
		{
			k = s1.charAt(i);
			a[k]++;
		}
		for (i = 0;i < c2;i++)
		{
			k = s2.charAt(i);
			a[k]--;
		}
		c3 = 1;
		for (i = 0;i < 256;i++)
		{

			if (a[i] != 0)
			{
				c3 = 0;
			}
		}
		if (c3 != 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}


			return 0;
	}
}

