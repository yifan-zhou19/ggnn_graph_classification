package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String p1;
		String p2;
	int i;
	int j;
	int n;
	int check = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	p1 = a;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	p2 = b;
	  for (i = 0;b.charAt(i) != '\0';i++)
	  {
		  if (a.charAt(0) == b.charAt(i))
		  {
				for (j = 0;a.charAt(j) != '\0';j++)
				{
				if (b.charAt(i + j) != a.charAt(j))
				{
					break;
				}
				}
			if (a.charAt(j) == '\0')
			{
				check = 1;
				n = i;
				break;
			}
		  }

	  }
	  if (check == 1)
	  {
		  System.out.printf("%d",n);
	  }
		return 0;
	}
}

