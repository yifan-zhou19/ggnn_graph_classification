package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[9999]);
	int i;
	int k;
	int j;
	int[] a = new int[400];
	str = new Scanner(System.in).nextLine();

	j = 0;
	i = 0;
	k = 0;
	while (str.charAt(i) != '\0')
	{
	   if (str.charAt(i) == ' ')
	   {
			while (str.charAt(i + 1) == ' ')
			{
				i++;
			}
			System.out.printf("%d,",a[j]),j++,k = 0,i++;
	   }
	  else
	  {
		  i++,k++,a[j] = k;
	  }
	}
	System.out.printf("%d",a[j]);

	}
}
