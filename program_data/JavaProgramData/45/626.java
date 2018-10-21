package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
	int i;
	int j;
	int la;
	int lb;
	int kai;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	la = a.length();
	lb = b.length();
	for (i = 0,kai = 1;i <= lb - 1;i++)
	{
		if (kai == 0)
		{
	break;
		}
						if (b.charAt(i) == a.charAt(0))
						{
									  for (j = 0;j <= la - 1;j++)
									  {
														if (a.charAt(j) != b.charAt(i + j))
														{
														break;
														}
														if (a.charAt(j) == b.charAt(i + j) && j == la - 1)
														{
														kai = 0;
														}
									  }
						}
	}
	System.out.printf("%d",i - 1);



	   return 0;
	}



}

