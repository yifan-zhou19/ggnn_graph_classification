package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  String a = new String(new char[500]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  a = new Scanner(System.in).nextLine();
	  int chang = a.length();
	  int i;
	  int j;
	  int k;
	  int[] num = new int[500];
	  for (i = 0;i < chang;i++)
	  {
		  num[i] = 1;
	  }
	  if (n == 2)
	  {
	  for (i = 0;i < chang - n + 1;i++)
	  {
		  for (j = i + 1;j < chang - n + 2;j++)
		  {
			  if (a.charAt(j) == a.charAt(i))
			  {
					if (a.charAt(j + 1) == a.charAt(i + 1))
					{
						num[i] = num[i] + 1;
					}
			  }
		  }
	  }
		  int max = 0;
		  for (j = 0;j < chang - n + 1;j++)
		  {
			  if (num[j] > max)
			  {
				max = num[j];
			  }
				else
				{
				;
				}
		  }

		  if (max == 1)
		  {
		  System.out.print("NO");
		  }
		  else
		  {
			  System.out.printf("%d\n",max);
			  for (i = 0;i < chang - n + 1;i++)
			  {
			  if (num[i] == max)
			  {
			  System.out.printf("%c%c\n",a.charAt(i),a.charAt(i + 1));
			  }
			  }
		  }
	  }
	  else if (n == 3)
	  {
		   for (i = 0;i < chang - n + 1;i++)
		   {
		  for (j = i + 1;j < chang - n + 2;j++)
		  {
			  if (a.charAt(j) == a.charAt(i))
			  {
					if (a.charAt(j + 1) == a.charAt(i + 1))
					{
						if (a.charAt(j + 2) == a.charAt(i + 2))
						{
						num[i] = num[i] + 1;
						}
					}
			  }
		  }
		   }
		  int max = 0;
		  for (j = 0;j < chang - n + 1;j++)
		  {
			  if (num[j] > max)
			  {
				max = num[j];
			  }
				else
				{
				;
				}
		  }

		  if (max == 1)
		  {
		  System.out.print("NO");
		  }
		  else
		  {
			  System.out.printf("%d\n",max);
			  for (i = 0;i < chang - n + 1;i++)
			  {
			  if (num[i] == max)
			  {
			  System.out.printf("%c%c%c\n",a.charAt(i),a.charAt(i + 1),a.charAt(i + 2));
			  }
			  }
		  }
	  }
	  else if (n == 4)
	  {
		   for (i = 0;i < chang - n + 1;i++)
		   {
		  for (j = i + 1;j < chang - n + 2;j++)
		  {
			  if (a.charAt(j) == a.charAt(i))
			  {
					if (a.charAt(j + 1) == a.charAt(i + 1))
					{
						if (a.charAt(j + 2) == a.charAt(i + 2))
						{
						  if (a.charAt(j + 3) == a.charAt(i + 3))
						  {
						  num[i] = num[i] + 1;
						  }
						}
					}
			  }
		  }
		   }
		  int max = 0;
		  for (j = 0;j < chang - n + 1;j++)
		  {
			  if (num[j] > max)
			  {
				max = num[j];
			  }
				else
				{
				;
				}
		  }

		  if (max == 1)
		  {
		  System.out.print("NO");
		  }
		  else
		  {
			  System.out.printf("%d\n",max);
			  for (i = 0;i < chang - n + 1;i++)
			  {
			  if (num[i] == max)
			  {
			  System.out.printf("%c%c%c%c\n",a.charAt(i),a.charAt(i + 1),a.charAt(i + 2),a.charAt(i + 3));
			  }
			  }
		  }
	  }


	  return 0;
	}
}

