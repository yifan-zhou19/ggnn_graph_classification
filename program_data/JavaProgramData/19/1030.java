package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String str = new String(new char[100]);
	String str1 = new String(new char[100]);
	String str2 = new String(new char[100]);
	str = new Scanner(System.in).nextLine();
	str1 = new Scanner(System.in).nextLine();
	str2 = new Scanner(System.in).nextLine();
	int len = str.length();
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char**temp=(char**)malloc(len *sizeof(int*));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	char[] temp = (String)malloc(len * (Integer.SIZE / Byte.SIZE));
	int i;
	int j = 0;
	int k = 0;
	for (i = 0;i < len;i++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	temp[i] = (String)malloc(len * (Integer.SIZE / Byte.SIZE));
	}
	for (i = 0;i < len;i++)
	{
		if (i == len - 1)
		{
			temp[j][k + 1] = 0;
		}
		if (str.charAt(i) != ' ')
		{
			temp[j][k] = str.charAt(i);
		k++;
		}
		else
		{
			temp[j][k] = 0;
			j++;
			k = 0;
		}
	}
	for (i = 0;i <= j;i++)
	{
		if (strcmp(temp[i],str1) == 0)
		{
	temp[i] = str2;
		}
	}

	for (i = 0;i <= j - 1;i++)
	{
		System.out.printf("%s",temp[i]);
	System.out.print(" ");
	}

	System.out.printf("%s",temp[j]);

	for (i = 0;i < len;i++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	free(temp[i]);
	}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	free(temp);
	return (0);
	}
}
