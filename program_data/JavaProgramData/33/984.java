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
	   String zfc = new String(new char[256]);
	   for (int i = 0;i <= n;i++)
	   {
			  zfc = new Scanner(System.in).nextLine();
			  for (int j = 0;j < zfc.length();j++)
			  {
					  if (j == zfc.length() - 1)
					  {
					  if (zfc.charAt(j) == 'A')
					  {
					  System.out.print("T\n");
					  }
										if (zfc.charAt(j) == 'T')
										{
					  System.out.print("A\n");
										}
														if (zfc.charAt(j) == 'G')
														{
					  System.out.print("C\n");
														}
														if (zfc.charAt(j) == 'C')
														{
					  System.out.print("G\n");
														}
					  }
											 if (j != zfc.length() - 1)
											 {
					  if (zfc.charAt(j) == 'A')
					  {
					  System.out.print("T");
					  }
										if (zfc.charAt(j) == 'T')
										{
					  System.out.print("A");
										}
														if (zfc.charAt(j) == 'G')
														{
					  System.out.print("C");
														}
														if (zfc.charAt(j) == 'C')
														{
					  System.out.print("G");
														}
											 }

			  }
	   }

	   int hou;
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   hou = Integer.parseInt(tempVar2);
	   }
		return 0;
	}

}

