package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char c;
		int max;
		int min;
		max = 0;
		min = 0;
		String maxs;
		String mins;
		String temp;
		int i;
		int k;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		maxs = (String)malloc(1);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		mins = (String)malloc(1);
		i = 0;
		p = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		temp = (String)malloc((Character.SIZE / Byte.SIZE) * 30);
		c = System.in.read();
		while (c != '\n')
		{
			if (c != ' ')
			{
				*(temp.Substring(i)) = c;
				i++;
			}
			else
			{
				if (p == 0)
				{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
					free(mins);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
					mins = (String)malloc((Character.SIZE / Byte.SIZE) * (i + 1));
					for (k = 0;k <= i;k++)
					{
						*(mins.Substring(k)) = *(temp.Substring(k));
					}
					min = i;
					p = 1;

				}
				if (i > max)
				{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
					free(maxs);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
					maxs = (String)malloc((Character.SIZE / Byte.SIZE) * (i + 1));
					for (k = 0;k <= i;k++)
					{
						*(maxs.Substring(k)) = *(temp.Substring(k));
					}
					max = i;
				}
				if (i < min)
				{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
					free(mins);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
					mins = (String)malloc((Character.SIZE / Byte.SIZE) * (i + 1));
					for (k = 0;k <= i;k++)
					{
						*(mins.Substring(k)) = *(temp.Substring(k));
					}
					min = i;
				}
				i = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
				free(temp);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				temp = (String)malloc((Character.SIZE / Byte.SIZE) * 30);
			}
			c = System.in.read();
		}
		if (i > max)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(maxs);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			maxs = (String)malloc((Character.SIZE / Byte.SIZE) * (i + 1));
			for (k = 0;k <= i;k++)
			{
				*(maxs.Substring(k)) = *(temp.Substring(k));
			}
			max = i;
		}
		if (i < min)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(mins);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			mins = (String)malloc((Character.SIZE / Byte.SIZE) * (i + 1));
			for (k = 0;k <= i;k++)
			{
				*(mins.Substring(k)) = *(temp.Substring(k));
			}
			min = i;
		}
		for (k = 0;k < max;k++)
		{
			System.out.printf("%c",*(maxs.Substring(k)));
		}
		System.out.print("\n");
		for (k = 0;k < min;k++)
		{
			System.out.printf("%c",*(mins.Substring(k)));
		}
	}
}
