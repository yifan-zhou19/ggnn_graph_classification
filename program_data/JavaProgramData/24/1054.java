package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] u = new char[50][100];
		String buf = new String(new char[5000]);

		int i = 0;
		int j;
		int k;
		int[] a = new int[50];
		int c = 0;
		int d = 100;
		int n;
		int ret;
		int index;
		int max;
		int min;

		buf = new Scanner(System.in).nextLine();
		j = 0;

		int len = buf.length();
		//printf("  ---  buf=%d\n", strlen(buf));

		buf = tangible.StringFunctions.changeCharacter(buf, buf.length(), ' ');
		buf = tangible.StringFunctions.changeCharacter(buf, buf.length() + 1, '\0');

		for (i = 0; i < len; i++)
		{
			index = 0;
			while (buf.charAt(i) != ' ')
			{
				u[j][index] = buf.charAt(i);
				index++;
				i++;
			}
			u[j][index] = '\0';
			a[j] = String.valueOf(u[j]).length();
			//printf("%s, %d, %d\n", u[j], a[j], j);
			j++;
			//printf("i = %d\n", i);
		}
		//printf("-----\n");
		n = j;
		for (i = 0;i < n;i++)
		{
			if (a[i] > c)
			{
				c = a[i];
				max = i;
			}
		}
		for (j = 0;j < n;j++)
		{
			if (a[j] < d)
			{
				d = a[j];
				min = j;
			}

		}
		//printf("%d, %d\n", max, min);

		System.out.printf("%s\n",u[max]);
		System.out.printf("%s",u[min]);

		return 0;
	}
}

