package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		 int n;
		 int c = 0;
		 int d = 0;
		 int a;
		 int b;
		 int e = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (int i = 0;i < n;i++)
		 {
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
			if (a - b == -1)
			{
				c++;
			}
			else if (a - b == 2)
			{
				c++;
			}
			else if (a - b == 1)
			{
				d++;
			}
			else if (a - b == -2)
			{
				d++;
			}
		 }
		 if (c > d)
		 {
			 System.out.print("A");
		 }
		 else if (c < d)
		 {
			 System.out.print("B");
		 }
		 else
		 {
			 System.out.print("Tie");
		 }
		 return 0;
	 }


}

