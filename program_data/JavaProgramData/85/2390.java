package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int o;
	int j;
	int w;
	int b;
	String shuzu = new String(new char[1000]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	System.in.read();
	for (i = 0,b = 1;i < n;i++,b = 1)
	{
	  shuzu = new Scanner(System.in).nextLine();
	  w = shuzu.length();
	  if (shuzu.charAt(0) >= '0' && shuzu.charAt(0) <= '9')
	  {
		  System.out.print("no\n");
		  b = 0;
	  }
	  else
	  {
		  for (o = 0;o < w;o++)
		  {
			if (!((shuzu.charAt(o) >= 'a' && shuzu.charAt(o) <= 'z') || (shuzu.charAt(o) >= 'A' && shuzu.charAt(o) <= 'Z') || (shuzu.charAt(o) == '_') || (shuzu.charAt(o) >= '0' && shuzu.charAt(o) <= '9')))
			{
				System.out.print("no\n");
				b = 0;
				break;
			}
		  }
	  }
	  if (b == 1)
	  {
		  System.out.print("yes\n");
	  }
	}
	return 0;
	}




}

