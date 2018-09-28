package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String string = new String(new char[100]);
		int i;
		int j;
		int num = 0;
		int word = 0;
		int[] a = new int[100]; //???????????????string????
		String = new Scanner(System.in).nextLine();
		for (i = 0,j = 0;string.charAt(i) != '\0';i++)
		{
			if (String[i] == ' ')
			{
				word = 0;
				a[j] = i;
				j++;
			}
			else if (word == 0)
			{
				word = 1;
				num++;
			}
		}
		if (num > 1)
		{
			for (i = a[j - 1] + 1;string.charAt(i) != '\0';i++)
			{
			System.out.printf("%c",string.charAt(i));
			}
			while (j >= 2)
			{
			   for (i = a[j - 2];i < a[j - 1];i++)
			   {
			   System.out.printf("%c",string.charAt(i));
			   }
			   j--;
			}
			System.out.print(" ");
			for (i = 0;i < a[0];i++)
			{
			System.out.printf("%c",string.charAt(i));
			}
		}
		else
		{
			System.out.println(String);
		}
	}
}
