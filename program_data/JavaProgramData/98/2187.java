package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int[] count = new int[20000];
		  int s = 0;
		  int n;
		  int m = 0;
		  final String a = "";
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n - 1;i++)
		  {
						   for (j = 0;j < 50;j++)
						   {
											String tempVar2 = ConsoleInput.scanfRead(null, 1);
											if (tempVar2 != null)
											{
												a.charAt(i)[j] = tempVar2;
											}
											if (a.charAt(i)[j] == ' ')
											{
												break;
											}
											count[i]++;
						   }
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a = tangible.StringFunctions.changeCharacter(a, n - 1, tempVar3);
		  }
		  for (i = 0;i < 50;i++)
		  {
						   if (a.charAt(n - 1)[i] != '\0')
						   {
							   count[n - 1]++;
						   }
						   else
						   {
							   break;
						   }
		  }
		  for (i = 0;i < n - 1;i++)
		  {
						  if (m + count[i] < 80 && m + count[i] + 1 + count[i + 1] <= 80)
						  {
										   for (j = 0;j < count[i];j++)
										   {
																  System.out.printf("%c",a.charAt(i)[j]);
										   }
										   System.out.print(" ");
										   m = m + count[i] + 1;
						  }
						  else if (m + count[i] < 80 && m + count[i] + 1 + count[i + 1]>80)
						  {
							   for (j = 0;j < count[i];j++)
							   {
								   System.out.printf("%c",a.charAt(i)[j]);
							   }
							   m = m + count[i] + 1;
						  }
						  else if (m + count[i] == 80)
						  {
							   for (j = 0;j < count[i];j++)
							   {
								   System.out.printf("%c",a.charAt(i)[j]);
							   }
							   System.out.print("\n");
							   m = 0;
						  }
						  else if (m + count[i] > 80)
						  {
							   System.out.print("\n");
							   for (j = 0;j < count[i];j++)
							   {
								   System.out.printf("%c",a.charAt(i)[j]);
							   }
	System.out.print(" ");
							   m = count[i] + 1;
						  }
		  }
	for (i = 0;i < count[n - 1];i++)
	{
		System.out.printf("%c",a.charAt(n - 1)[i]);
	}
	}
}

