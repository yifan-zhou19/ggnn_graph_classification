public class person
{
	public int sex;
	public String h = new String(new char[5]);
	public double height;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i = 0;
		int count = 0;
		person[] line;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		line = tangible.Arrays.initializeWithDefaultpersonInstances(N);
		while (i < N)
		{
			char sex;
			char tmp;
			String h = new String(new char[5]);
			int k = 0;
			int point = 0;
			int num = 0;
			int j = 0;
			double number;
			int length = 0;
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				sex = tempVar2.charAt(0);
			}
			while ((tmp = fgetc(stdin)) != ' ')
			{
			}


			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				h = tempVar3.charAt(0);
			}
			fgetc(stdin);

			while (h.charAt(j) != '\0')
			{
				line[i].h = tangible.StringFunctions.changeCharacter(line[i].h, j, h.charAt(j));
				j++;
			}
			line[i].h = tangible.StringFunctions.changeCharacter(line[i].h, j, '\0');

			while (h.charAt(k) != '\0')
			{
				int one = 0;
				if (h.charAt(k) == '.')
				{
					point = k;
				}
				else
				{
					one = h.charAt(k) - 48;
					num = num * 10 + one;
				}
				k++;
				length++;
			}
			point = length - point - 1;
			number = (double)num / (Math.pow(10.0,point));

			line[i].height = number;
			if (sex == 'm')
			{
				line[i].sex = 1;
			}
			if (sex == 'f')
			{
				line[i].sex = 0;
			}
			i++;
		}

		i = N - 1;
		while (i > 0)
		{
			int k = 0;
			while (k < i)
			{
				if (line[k].height > line[k + 1].height)
				{
					person tmp = line[k];
					line[k] = line[k + 1];
					line[k + 1] = tmp;
				}
				k++;
			}
			i--;
		}

		i = 0;
		while (i < N)
		{
			if (line[i].sex == 1)
			{
				System.out.printf("%s", line[i].h);
				count++;
				if (count != N)
				{
				System.out.print(" ");
				}
			else
			{
				System.out.print("\n");
			}
			}

			i++;
		}
		i = N - 1;
		while (i >= 0)
		{
			if (line[i].sex == 0)
			{
				System.out.printf("%s", line[i].h);
				count++;
				if (count != N)
				{
				System.out.print(" ");
				}
			else
			{
				System.out.print("\n");
			}
			}

			i--;
		}
		return 0;
	}
}

