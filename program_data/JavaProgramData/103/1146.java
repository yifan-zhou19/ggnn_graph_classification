package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int num = 1;
		int i;
		int j;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == a.charAt(i + 1) || a.charAt(i) == a.charAt(i + 1) + 32 || a.charAt(i) == a.charAt(i + 1) - 32) //??????????
			{
			num++;
			}
			else
			{
			if (a.charAt(i) < 91) //???????
			{
			System.out.printf("(%c,%d)",a.charAt(i),num); //??????
			}
			else
			{
			System.out.printf("(%c,%d)",a.charAt(i) - 32,num);
			}
			num = 1;
			}
		}
	}

}
