package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int n;
		int i;
		int sum;
		int temp;
		int[] k = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0) //????
		{
			sum = 0;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			for (i = 0;i < a;i++) //??
			{
			k[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			 if (k[a - 1] + a * 3 < 60)
			 {
			 System.out.print(60 - a * 3);
			 System.out.print("\n");
			 }
			 else
			 {
				 for (i = 0;i < a;i++) //????
				 {
					 if ((k[i] + (i + 1) * 3) < 60 && (k[i + 1] + (i + 2) * 3>60))
					 {
					 temp = 60 - (i + 1) * 3;
					 if (k[i + 1] == temp - 1)
					 {
					 System.out.print(temp - 1);
					 System.out.print("\n");
					 }
					 else
					 {
						 System.out.print(temp);
						 System.out.print("\n");
					 }
					 }
				 }
			 }


		 n--;
		}
		return 0;
	}

}

