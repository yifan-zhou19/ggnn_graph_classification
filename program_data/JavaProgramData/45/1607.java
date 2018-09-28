package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[50]);
	   String b = new String(new char[50]);
	   int i;
	   int k;
	   int flag = 0;
	   a = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   b = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   for (i = 0;b.charAt(i) != '\0';i++)
	   {
			if (a.charAt(0) == b.charAt(i))
			{
			   for (k = 1;a.charAt(k) != '\0';k++)
			   {
				   if (a.charAt(k) != b.charAt(i + k))
				   {
					   flag = 1;
					   break;
				   }
			   }
				if (flag == 0)
				{
					System.out.print(i);
					System.out.print("\n");
					break;
				}
			}
	   }
	   return 0;
	}



}

