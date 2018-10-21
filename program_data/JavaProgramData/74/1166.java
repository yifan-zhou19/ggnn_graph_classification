package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
		int i;
		int k;
		int t;
		k = (int)Math.sqrt(a);
		for (i = 3;i <= k;i = i + 2)
		{
		  if (a % i != 0 && a % 2 != 0)
		  {
		t = 1;
		  }
		else
		{
			t = 0;
			break;
		}
		}
		return t;
	}
	public static int check(int a)
	{
		int t;
		int[] b = new int[100];
		int k;
		  int i;
		  for (i = 1;a != 0;i++)
		  {
			  b[i] = a % 10;
			a = a / 10;
			k = i;
		  }
		for (i = 1;i <= k / 2;i++)
		{
		if (b[i] == b[k - i + 1])
		{
		  t = 1;
		}
		else
		{
			t = 0;
			break;
		}
		}
		return t;
	}
	public static int Main()
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		int i;
		int con = 0;
		for (i = n;i <= m;i++)
		{
			if (check(i) == 1 && sushu(i) == 1 && con != 0)
			{
			  System.out.printf(",%d",i);
			 con++;
			}
		if (check(i) == 1 && sushu(i) == 1 && con == 0)
		{
			 System.out.printf("%d",i);
		  con++;
		}
		}
	   if (con == 0)
	   {
	   System.out.print("no");
	   }
	}

}

