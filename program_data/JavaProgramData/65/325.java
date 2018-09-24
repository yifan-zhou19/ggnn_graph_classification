package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int A = 0;
		int B = 0;
		int n;
		int i;
		int j;

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
			 a = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 b = Integer.parseInt(tempVar3);
		 }
		 j = a - b;
		 if (j == -1 || j == 2)
		 {
		 A++;
		 }
		 else if (j == 1 || j == -2)
		 {
		 B++;
		 }

		}
		if (A > B)
		{
		System.out.print("A");
		}
		if (A < B)
		{
		System.out.print("B");
		}
		if (A == B)
		{
		System.out.print("Tie");
		}

	}
}

