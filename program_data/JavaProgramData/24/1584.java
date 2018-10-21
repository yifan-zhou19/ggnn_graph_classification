package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int i = 0;
		 int l;
		 int k = 0;
		 int[] count = new int[10000];
		 int[] ct = new int[200];
		 int max;
		 int min;
		String zfc = new String(new char[10000]);
		zfc = new Scanner(System.in).nextLine();
		l = zfc.length();
		while (i < l)
		{
							   if (zfc.charAt(i) != ' ' && zfc.charAt(i) != ',')
							   {
											count[i] = k;
											ct[k] += 1;
							   }
							   else if (zfc.charAt(i) == ' ')
							   {
								   k = k + 1;
								   count[i] = -1;
							   }
							   else
							   {
									   count[i] = -1;
									   k = k + 1;
									   i = i + 1;
									   count[i] = -1;
							   }
							   i++;
		}
		for (i = 0;i <= k;i++)
		{
						 if (i == 0)
						 {
								 max = 0;
								 min = 0;
						 }
						 else
						 {
							 if (ct[i] > ct[max])
							 {
											  max = i;
							 }
							 else if (ct[i] < ct[min])
							 {
												min = i;
							 }
							 else
							 {
								 ;
							 }
						 }
		}
		for (i = 0;i < l;i++)
		{
						if (count[i] == max)
						{
										 System.out.printf("%c",zfc.charAt(i));
						}
		}
		System.out.print("\n");
		for (i = 0;i < l;i++)
		{
						if (count[i] == min)
						{
										 System.out.printf("%c",zfc.charAt(i));
						}
		}
		return 0;
	}
}
