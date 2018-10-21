package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] s = new int[200];
		int i;
		for (i = 0;i < 200;i++)
		{
			s[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
		   int a;
		   int b;
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   b = Integer.parseInt(tempVar3);
		   }
		   if (a - b == -1 || a - b == 2)
		   {
			  s[i] = 1;
		   }
		   if (a - b == 1 || a - b == -2)
		   {
			  s[i] = 2;
		   }
		   if (a == b)
		   {
			  s[i] = 0;
		   }
		}
		int A = 0;
		int B = 0;
		for (i = 0;i < n;i++)
		{
			if (s[i] == 1)
			{
			   A++;
			}
			if (s[i] == 2)
			{
			   B++;
			}
		}
		if (A > B)
		{
		   System.out.print("A\n");
		}
		if (B > A)
		{
		   System.out.print("B\n");
		}
		if (A == B)
		{
		   System.out.print("Tie\n");
		}
	}
}

