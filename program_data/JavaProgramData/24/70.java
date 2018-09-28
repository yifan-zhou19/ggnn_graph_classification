package <missing>;

public class GlobalMembers
{
	public static String sentence = new String(new char[1000]);
	public static void Main()
	{
		sentence = new Scanner(System.in).nextLine();
		int i;
		int lenth = 0;
		int place = 0;
		int max = 0;
		for (i = 0;sentence.charAt(i) != '\0';i++)
		{
			for (lenth = 0;(sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') || (sentence.charAt(i) >= 'A' && sentence.charAt(i) <= 'Z');i++)
			{
				lenth++;
				if (max < lenth)
				{
					max = lenth;
					place = i;
				}
			}
		}

		for (i = (place - max + 1);i <= place;i++)
		{
			System.out.printf("%c",sentence.charAt(i));
		}
		 System.out.print("\n");

		int j;
		int lenth2 = 0;
		int place2 = 0;
		int min = 100;
		for (j = 0;sentence.charAt(j) != '\0';j++)
		{
			for (lenth2 = 0;(sentence.charAt(j) >= 'a' && sentence.charAt(j) <= 'z') || (sentence.charAt(j) >= 'A' && sentence.charAt(j) <= 'Z');j++)
			{
				lenth2++;
			}
				if (min > lenth2)
				{
					min = lenth2;
					place2 = j;
				}

		}

		for (j = (place2 - min);j < place2;j++)
		{
			System.out.printf("%c",sentence.charAt(j));
		}
		System.out.print("\n");

	}

}
