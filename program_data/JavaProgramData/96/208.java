package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		int[] a = new int[100];
		int i;
		int len;
		int count = 0;
		int num = 1;
		s = new Scanner(System.in).nextLine();
		len = s.length();
		if (len == 1)
		{
			System.out.printf("0\n%d",s.charAt(0) - 48);
		}
		else if (len == 2 && (s.charAt(0) - 48) * 10 + (s.charAt(1) - 48) < 13)
		{
			System.out.printf("0\n%d",(s.charAt(0) - 48) * 10 + s.charAt(1) - 48);
		}
		else
		{
			for (i = 0;i < len;i++)
			{
			s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 48);
			}
		if (s.charAt(0) * 10 + s.charAt(1) >= 13)
		{
			for (i = 0;i < len && count < len - 1;i++)
			{
			a[count] = (s.charAt(i) * 10 + s.charAt(i + 1)) / 13;
		s = tangible.StringFunctions.changeCharacter(s, i + 1, (s.charAt(i) * 10 + s.charAt(i + 1)) % 13);
		count++;
			}
		 for (i = 0;i < count;i++)
		 {
			System.out.printf("%d",a[i]);
		 }
		 System.out.printf("\n%d",s.charAt(i + 1));
		}
		else
		{
			a[0] = (s.charAt(0) * 100 + s.charAt(1) * 10 + s.charAt(2)) / 13;
		s = tangible.StringFunctions.changeCharacter(s, 2, (s.charAt(0) * 100 + s.charAt(1) * 10 + s.charAt(2)) % 13);
		 for (i = 2;i < len && num < (len - 2);i++)
		 {
			a[num] = (s.charAt(i) * 10 + s.charAt(i + 1)) / 13;
		s = tangible.StringFunctions.changeCharacter(s, i + 1, (s.charAt(i) * 10 + s.charAt(i + 1)) % 13);
		num++;
		 }
		for (i = 0;i < num;i++)
		{
			System.out.printf("%d",a[i]);
		}
		System.out.printf("\n%d",s.charAt(i + 1));
		}
		}
		return 0;
	}



}

