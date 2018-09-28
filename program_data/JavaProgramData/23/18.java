package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100]);
		char[][] string = new char[100][100];
		String p;
		(char)(*q)[100];
		int i;
		int j;
		int k;
		p = str;
		str = new Scanner(System.in).nextLine();
		q = String;
		j = 0;
		k = 0;
		for (i = 0; * (p.Substring(i)) != '\0';i++)
		{
			if (*(p.Substring(i)) == ' ')
			{
				*(*(q + j) + k) = '\0';
				j++;
				k = 0;
			}
			else
			{
				*(*(q + j) + k) = *(p.Substring(i));
				k++;
			}
		}
		*(*(q + j) + k) = '\0';
		for (i = j;i > 0;i--)
		{
			System.out.printf("%s ",q + i);
		}
		System.out.printf("%s\n",q);
	}

}
