package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[100]);
		  int i;
		  int count = 0;
		  int[] shang = new int[100];
		  int yu = 0;
		  int q = 0;
		  int h = 0;
		  int[] t = new int[100];
		  for (i = 0;i < 100;i++)
		  {
							a = tangible.StringFunctions.changeCharacter(a, i, '\0');
							shang[i] = 0;
							t[i] = 0;
		  }
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  for (i = 0;i < 100;i++)
		  {
							if (a.charAt(i) == '\0')
							{
								break;
							}
							count++;
		  }
		  for (i = 0;i < count;i++)
		  {
								 q = (a.charAt(i) - '0') + yu * 10;
								 shang[i] = q / 13;
								 yu = q - 13 * shang[i];
		  }
		  if (shang[0] == 0)
		  {
						 for (i = 0;i < 100;i++)
						 {
										t[i] = shang[i];
						 }
						 for (i = 0;i < 99;i++)
						 {
										shang[i] = t[i + 1];
						 }
						 if (shang[0] != 0)
						 {
										for (i = 0;i < count - 1;i++)
										{
											   System.out.printf("%d",shang[i]);
										}
						 }
						 else
						 {
												for (i = 0;i < 100;i++)
												{
																  t[i] = 0;
												}
												for (i = 0;i < 100;i++)
												{
																  t[i] = shang[i];
												}
												 for (i = 0;i < 99;i++)
												 {
																  shang[i] = t[i + 1];
												 }
												 if (shang[0] != 0)
												 {
																for (i = 0;i < count - 2;i++)
																{
																	   System.out.printf("%d",shang[i]);
																}
												 }
												 else
												 {
												 System.out.print("0");
												 }
						 }

		  }
		  else
		  {
			  for (i = 0;i < count - 1;i++)
			  {
									System.out.printf("%d",shang[i]);
			  }
		  }
		  System.out.printf("\n%d",yu);
	}
}

