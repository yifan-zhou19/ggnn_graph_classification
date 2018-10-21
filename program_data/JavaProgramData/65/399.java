package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int[] s = new int[2];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 while (n-- != 0)
		 {
			int a;
			int b;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a == 0 && b == 1)
			{
				s[0]++;
			}
			if (a == 1 && b == 2)
			{
				s[0]++;
			}
			if (a == 2 && b == 0)
			{
				s[0]++;
			}
			if (b == 0 && a == 1)
			{
				s[1]++;
			}
			if (b == 1 && a == 2)
			{
				s[1]++;
			}
			if (b == 2 && a == 0)
			{
				s[1]++;
			}
		 }
		 if (s[0] == s[1])
		 {
			 System.out.print("Tie\n");
		 }
		 else if (s[0] > s[1])
		 {
			 System.out.print("A\n");
		 }
		 else
		 {
			 System.out.print("B\n");
		 }
	}

}

