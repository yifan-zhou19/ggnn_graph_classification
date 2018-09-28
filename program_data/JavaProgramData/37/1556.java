package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char check = char string[];
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		int i;
		char v;
		char[][] string = new char[100][1000];
		for (i = 1;i <= t;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 string[i] = tempVar2.charAt(0);
						 }
						 v = check(String[i]);
						 if (v == '+')
						 {
						 System.out.print("no\n");
						 }
						 else
						 {
						 System.out.printf("%c\n", v);
						 }
		}
		return 0;
	}

		 public static char check(String string)
		 {
			  int n;
			  n = String.length();
			  int k;
			  int j;
			  int flag = 0;
			  int count = 0;
			  char m = '+';
			  for (k = 0;k < n;k++)
			  {
							  flag = 0;
							  for (j = 0;j < n;j++)
							  {
												if (string[j].equals(String[k]) && k != j)
												{
																		flag = 1;
																		break;
												}

							  }
							  if (flag == 0)
							  {
										 return (String[k]);
										 count++;
										 break;
							  }

			  }
			  if (count == 0)
			  {
										  return (m);
			  }
		 }


}

