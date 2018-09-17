package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sr = new String(new char[302]);
		char[] i = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '\0', '\0'};
		int r = 0;
		int j;
		int m;
		int[] sum = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sr = tempVar.charAt(0);
		}
		for (m = 0;sr.charAt(m) != '\0';m++)
		{
		 for (j = 0;j < 26;j++)
		 {
						  if (sr.charAt(m) == i[j])
						  {
										   sum[j]++;
										   r = 1;
						  }
		 }
		}
		if (r == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (j = 0;j < 26;j++)
			{
							   if (sum[j] != 0)
							   {
											 System.out.printf("%c=%d\n",i[j],sum[j]);
							   }
			}
		}
		return 0;
	}
}

