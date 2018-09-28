package <missing>;

public class GlobalMembers
{
	public static int f(String a)
	{
		int i;
		int m;
		int b = 1;
		int n = 0;
		m = a.length();
		if ((a[0].equals('_')) || (a[0].compareTo('a') >= 0 && a[0].compareTo('z') <= 0) || (a[0].compareTo('A') >= 0 && a[0].compareTo('Z') <= 0))
		{
			n = 1;
		 for (i = 1;i < m;i++)
		 {
			 if ((a[i].equals('_')) || (a[i].compareTo('a') >= 0 && a[i].compareTo('z') <= 0) || (a[i].compareTo('A') >= 0 && a[i].compareTo('Z') <= 0) || (a[i].compareTo('0') >= 0 && a[i].compareTo('9') <= 0))
			 {
				 n = n + 1;
			 }
		 }
			 if (n == m)
			 {
				 b = 0;
			 }

		}

		return (b);
	}



	public static void Main()
	{
		int n;
		int i;
		int[] b = new int[100];
		char[][] a = new char[100][21];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = tempVar2.charAt(0);
		}
		b[i] = f(a[i]);
		}
	  for (i = 0;i < n;i++)
	  {
			if (b[i] == 0)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
	  }
	}
}

