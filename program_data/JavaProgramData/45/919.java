package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int j;
	int l1;
	int l2;
	String a = new String(new char[20]);
	String b = new String(new char[20]);
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
	l1 = a.length();
	l2 = b.length();
	  for (j = 0;j < l2;j++)
	  {
			if (a.charAt(0) == b.charAt(j))
			{
		  for (i = 0;i < l1;i++)
		  {
					if (a.charAt(i) != b.charAt(i + j))
					{
						break;
					}
				 else if (a.charAt(i) == b.charAt(j + i) && i < l1 - 1)
				 {
					 continue;
				 }
				 else if (a.charAt(i) == b.charAt(j + i) && i == l1 - 1)
				 {
					 System.out.printf("%d",j);
				 }
				 return 0;
		  }
			}
	  }
	}


}

