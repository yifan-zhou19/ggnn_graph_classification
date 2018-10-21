package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   String N = new String(new char[L]);
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   N = tempVar.charAt(0);
		   }
		   int i;
		   int r = 0;
		   for (i = 0;i < L;i++)
		   {
				r = 10 * r + (N.charAt(i) - '0');
				if (i == 0)
				{
				;
				}
				else
				{
				if (i == 1 && r / 13 == 0)
				{
				;
				}
				else
				{
				System.out.printf("%d",r / 13);
				}
				}
				r = r % 13;
				if (N.charAt(i + 1) == '\0')
				{
				break;
				}
		   }
		  if (i == 0 || (i == 1 && r > 9))
		  {
		  System.out.print("0");
		  }
		  System.out.print("\n");
		  System.out.printf("%d",r);
	}
}

