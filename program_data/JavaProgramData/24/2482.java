package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		int len;
		int[] b = new int[500];
		int i;
		int k;
		int max;
		int min;
		int p = 0;
		int q = 0;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		k = 0;
		for (i = 0;i < len;i++)
		{
				if (a.charAt(i) == ' ' || a.charAt(i) == ',')
				{
					b[k] = i,k++;
				}
		}
			b[k] = i;
		max = b[0] + 1;
		min = b[0] + 1;
		for (i = 0;i < k;i++)
		{
			 if (b[i + 1] - b[i] > max)
			 {
				 max = b[i + 1] - b[i];
				 p = i;
			 }
			 else if (b[i + 1] - b[i] < min && b[i + 1] - b[i]>1)
			 {
				 min = b[i + 1] - b[i];
				 q = i;
			 }
		}
		 if (max == b[0] + 1)
		 {
			 for (i = 0;i < b[0];i++)
			 {
			 System.out.printf("%c",a.charAt(i));
			 }
		 }
		 else
		 {
			 for (i = b[p] + 1;i < b[p + 1];i++)
			 {
			 System.out.printf("%c",a.charAt(i));
			 }
		 }
			System.out.print("\n");
			if (min == b[0] + 1)
			{
			 for (i = 0;i < b[0];i++)
			 {
			 System.out.printf("%c",a.charAt(i));
			 }
			}
		 else
		 {
			 for (i = b[q] + 1;i < b[q + 1];i++)
			 {
			 System.out.printf("%c",a.charAt(i));
			 }
		 }

	}
}
