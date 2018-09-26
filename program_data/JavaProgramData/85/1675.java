package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k = 0;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[10000];
		String buf = new String(new char[21]);
		for (m = 0;m < n;m++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				buf = tempVar2.charAt(0);
			}
			 for (i = 0;buf.charAt(i);i++)
			 {

				if ((buf.charAt(i) == '_') || (buf.charAt(i) >= 'A' && buf.charAt(i) <= 'Z') || (buf.charAt(i) >= 'a' && buf.charAt(i) <= 'z') || (buf.charAt(i) >= '0' && buf.charAt(i) <= '9' && i != 0))
				{
				   a[k] = 1;
				}
				else
				{
				   a[k] = 0;
				   break;
				}
			 }
			k++;
		}
		for (m = 0;m < k;m++)
		{
	if (a[m] == 0)
	{
			   System.out.print("no\n");
	}
			else
			{
			   System.out.print("yes\n");
			};

		}

		return 0;

	}






}

