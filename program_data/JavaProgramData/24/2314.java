package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int maxnum = 0;
		int minnum = 99;
		int i;
		int flag = 0;
		String max = new String(new char[50]);
		String min = new String(new char[50]);
		String temp = new String(new char[50]);
		char t;
		while (true)
		{
			do
			{
				t = System.in.read();
			}while (t == ' ' || t == ',');
			for (i = 0;t != ' ' && t != ',';)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, i, t);
				t = System.in.read();
				i++;
				if (t == '\n')
				{
					flag = 1;
					break;
				}
			}
			temp = tangible.StringFunctions.changeCharacter(temp, i, '\0');
			if (i > maxnum)
			{
				max = temp;
				maxnum = i;
			}
			if (i < minnum)
			{
				min = temp;
				minnum = i;
			}
			if (flag == 1)
			{
				break;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
		System.out.print(max);
		System.out.print("\n");
		System.out.print(min);
		System.out.print("\n");

		return 0;
	}
}

