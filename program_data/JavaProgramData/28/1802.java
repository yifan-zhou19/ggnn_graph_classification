package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		s = new Scanner(System.in).nextLine();
		int i;
		int[] count = new int[200];
		int len;
		int j = 0;
		int first = 1;
		len = s.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(count, 0, (Integer.SIZE / Byte.SIZE));
		for (i = 0; i < len; i++)
		{
			if (s.charAt(i) != ' ')
			{

			   do
			   {
					count[j]++;
					i++;
			   }while ((i != len) && (s.charAt(i) != ' '));

				j++;

			}
		}
		for (i = 0; i < j; i++)
		{
			if (first != 0)
			{
			first = 0;
			}
			else
			{
				System.out.print(",");
			}
			System.out.printf("%d", count[i]);
		}
		System.out.print("\n");
		return 0;
	}


}
