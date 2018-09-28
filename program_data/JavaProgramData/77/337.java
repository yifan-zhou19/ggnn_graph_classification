package <missing>;

public class GlobalMembers
{
	public static String queue = new String(new char[100]);
	public static int Main()
	{
		queue = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = queue.length();
		int i;
		int j;
		int temp;
		for (i = 0; i < len - 1;)
		{
			if (queue.charAt(len - 1) == ' ')
			{
				break;
			}
			if (queue.charAt(i) != ' ')
			{
				if (queue.charAt(i + 1) == queue.charAt(i))
				{
					i++;
					continue;
				}
				else if (queue.charAt(i + 1) == ' ')
				{
					j = i + 1;
					while (queue.charAt(j) == ' ')
					{
						j++;
					}
					if (queue.charAt(j) != queue.charAt(i))
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
						queue = tangible.StringFunctions.changeCharacter(queue, i, queue[j] = ' ');
						if (i == 0)
						{
							continue;
						}
						temp = i - 1;
						while (queue.charAt(temp) == ' ')
						{
							temp--;
						}
						i = temp;
					}
					else
					{
						i = j;
					}
				}
				else
				{
					if (queue.charAt(i) == queue.charAt(0))
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(i + 1);
						System.out.print("\n");
						queue = tangible.StringFunctions.changeCharacter(queue, i, ' ');
						queue = tangible.StringFunctions.changeCharacter(queue, i + 1, ' ');
						if (i == 0)
						{
							continue;
						}
						temp = i - 1;
						while (queue.charAt(temp) == ' ')
						{
							temp--;
						}
						i = temp;
					}
				}
			}
			else
			{
				i++;
				continue;
			}
		}
		return 0;
	}

}

