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
		while (n-- != 0)
		{
			String t1 = new String(new char[1000]);
			String t2 = new String(new char[1000]);
			int[] num1 = new int[1000];
			int[] num2 = new int[1000];
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				t2 = tempVar3.charAt(0);
			}
		int i;
		int k = 0;
		  for (i = t1.length() - 1;i >= 0;i--)
		  {
			  num1[k] = t1.charAt(i) - '0';
			  k++;
		  }
		  k = 0;


		  for (i = t2.length() - 1;i >= 0;i--)
		  {
			  num2[k] = t2.charAt(i) - '0';
			  k++;
		  }

		  for (i = 0;i < t1.length();i++)
		  {
			  num1[i] = num1[i] - num2[i];
			  if (num1[i] < 0)
			  {
				  num1[i] = num1[i] + 10;
				  num1[i + 1]--;
			  }
		  }
		  int check = 0;
	  for (i = t1.length() - 1;num1[i] == 0;i--)
	  {
		  ;
	  }
	  for (;i >= 0;i--)
	  {
		  System.out.printf("%d",num1[i]);
		  check = 1;
	  }
	  System.out.print("\n");

	  if ((check == 0) && (i == -1))
	  {
		  System.out.printf("%d",0);
	  }
		}
		return 0;
	}
}

