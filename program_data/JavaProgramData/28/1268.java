package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String string = new String(new char[10000]);
	int i;
	int num = 0;
	int word = 0;
	int[] a = new int[300];
	char c;
	String = new Scanner(System.in).nextLine();
	for (i = 0;(c = string.charAt(i)) != '\0';i++)
	{
	   if (c == ' ')
	   {
		   word = 0;
	   }
	   else
	   {
				if (word == 0)
				{
				   word = 1;
				   num = num + 1;
					  a[num - 1] = 0;
				}
			   a[num - 1]++;
	   }
	}
	for (i = 0;i < num - 1;i++)
	{
	System.out.printf("%d,",a[i]);
	}
	System.out.printf("%d",a[num - 1]);
	}
}
