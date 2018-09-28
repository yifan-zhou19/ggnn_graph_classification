package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[256]);
		String z1 = new String(new char[256]);
		String z2 = new String(new char[256]);
		int i;
		int j;
		int k;
		int n;
		int p;
		int count;
		int count1;
		int count2;
		int count4;
		int[] count3 = new int[50];
		int num1;
		int num2;
		int d = 0;
		zfc = new Scanner(System.in).nextLine();
		z1 = new Scanner(System.in).nextLine();
		z2 = new Scanner(System.in).nextLine();
		count = 0;
		num1 = zfc.length();
		num2 = z1.length();
		for (i = 0;i < num1;i++)
		{
			count1 = 0;
			for (j = 0;j < num2;j++)
			{
				if (zfc.charAt(i + j) == z1.charAt(j))
				{
					count1++;
				}
			}
			if (count1 == num2)
			{
				break;
			}
		}
		if (count1 == num2)
		{
			for (j = i;j < num2 + i;j++)
			{
				zfc = tangible.StringFunctions.changeCharacter(zfc, j, z2.charAt(j - i));
			}
		}
		  System.out.printf("%s",zfc);
		return 0;
	}


}

