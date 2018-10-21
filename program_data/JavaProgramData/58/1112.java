package <missing>;

public class GlobalMembers
{
	  public static int Main()
	  {
			int i;
			int j;
			int n;
			String str = new String(new char[1000]);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			for (i = 0;i < n;i++)
			{
				str = new Scanner(System.in).nextLine();
			for (j = 0;str.charAt(j);j++)
			{
				if (!((str.charAt(j) == '_') || (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') || (str.charAt(j) >= 'a' && str.charAt(j) <= 'z') || (str.charAt(j) >= '0' && str.charAt(j) <= '9' && j>0)))
				{
			break;
				}
			}
			if (str.charAt(j) != null)
			{
			System.out.print("0\n");
			}
			else
			{
			System.out.print("1\n");
			}
			}
			System.in.read();
			System.in.read();
	  }


}

