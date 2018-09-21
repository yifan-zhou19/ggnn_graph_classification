package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1001]);
		int i;
		int j;
		int s = 0;
		int max = 0;
		int min = 0;
		int begin1;
		int end1;
		int begin2;
		int end2;
		int t;
		str = new Scanner(System.in).nextLine();
		for (t = 0;t < str.length();t++)
		{
			if (str.charAt(t) != ' ' && str.charAt(t) != ',' && t != str.length() - 1)
			{
				s++;
			}
			else if (t == str.length() - 1)
			{
				s++;
			}
			if (str.charAt(t) == ' ' || str.charAt(t) == ',')
			{
				end1 = t - 1;
				end2 = t - 1;
				begin1 = 0;
				begin2 = 0;
				max = s;
				min = s;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto p;
			}
			else if (t == str.length() - 1)
			{
				end1 = t;
				end2 = t;
				begin1 = 0;
				begin2 = 0;
				max = s;
				min = s;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto loop;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	p:
		for (i = t;i < str.length();i++)
		{
			if (str.charAt(i) != ' ' && str.charAt(i) != ',' && i != str.length() - 1)
			{
				s++;
			}
			else if (i == str.length() - 1)
			{
				s++;
			}
			if (str.charAt(i) == ' ' || str.charAt(i) == ',')
			{
				if (s > max)
				{
					end1 = i - 1;
					max = s;
					for (j = end1;;j--)
					{
						if ((str.charAt(j) != ' ' && str.charAt(j) != ',') && (str.charAt(j - 1) == ' ' || str.charAt(j - 1) == ','))
						{
							begin1 = j;
							break;
						}
					}
				}
				else if (s < min && s>0)
				{
						end2 = i - 1;
						min = s;
						for (j = end2;;j--)
						{
							if ((str.charAt(j) != ' ' && str.charAt(j) != ',') && (str.charAt(j - 1) == ' ' || str.charAt(j - 1) == ','))
							{
								begin2 = j;
								break;
							}
						}
				}
				s = 0;
			}
			else if (i == str.length() - 1)
			{
				if (s > max)
				{
					end1 = i;
					max = s;
					for (j = end1;;j--)
					{
						if ((str.charAt(j) != ' ' && str.charAt(j) != ',') && (str.charAt(j - 1) == ' ' || str.charAt(j - 1) == ','))
						{
							begin1 = j;
							break;
						}
					}
				}
				else if (s < min && s>0)
				{
						end2 = i;
						min = s;
						for (j = end2;;j--)
						{
							if ((str.charAt(j) != ' ' && str.charAt(j) != ',') && (str.charAt(j - 1) == ' ' || str.charAt(j - 1) == ','))
							{
								begin2 = j;
								break;
							}
						}
				}
				s = 0;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
		for (i = begin1;i <= end1;i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
		System.out.print("\n");
		for (i = begin2;i <= end2;i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
	}
}
