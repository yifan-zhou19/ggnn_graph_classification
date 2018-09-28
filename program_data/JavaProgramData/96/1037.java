package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int m;
		  int count;
		  int[] a = new int[SIZE];
		  int[] b = new int[SIZE];
		  String string = new String(new char[101]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  String = tempVar;
		  }
		  for (i = 0;i <= 99;i++)
		  {
		  a[i] = 0;
		  }
		  count = 0;
		  for (i = 0;i <= 99;i++)
		  {
							if (String[i] == '\0')
							{
							break;
							}
							a[i] = string.charAt(i) - 48;
							count++;
		  }
		  if (count > 2)
		  {
					  for (i = 0;i <= count - 2;i++)
					  {
					  b[i] = 0;
					  }
					  for (i = 0;i <= count - 2;i++)
					  {
											 b[i] = (a[i] * 10 + a[i + 1]) / 13;
											 a[i + 1] = (a[i] * 10 + a[i + 1]) % 13;
					  }
					  m = a[count - 1];
					  if (b[0] == 0)
					  {
								 for (i = 1;i <= count - 2;i++)
								 {
								 System.out.printf("%d",b[i]);
								 }
								 System.out.print("\n");
								 System.out.printf("%d",m);
					  }
					  if (b[0] != 0)
					  {
								 for (i = 0;i <= count - 2;i++)
								 {
								 System.out.printf("%d",b[i]);
								 }
								 System.out.print("\n");
								 System.out.printf("%d",m);
					  }
		  }
		  if (count == 1)
		  {
					  System.out.printf("%d",0);
					  System.out.print("\n");
					  System.out.printf("%d",a[0]);
		  }
		  if (count == 2)
		  {
					  if ((a[0] * 10 + a[1]) < 13)
					  {
											System.out.printf("%d",0);
											System.out.print("\n");
											System.out.printf("%d",a[0] * 10 + a[1]);
					  }
					  if ((a[0] * 10 + a[1]) >= 13)
					  {
										   System.out.printf("%d",(a[0] * 10 + a[1]) / 13);
										   System.out.print("\n");
										   System.out.printf("%d",(a[0] * 10 + a[1]) % 13);
					  }
		  }

	}






}

