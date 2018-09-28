package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String p0;
	String p1;
	int i;
	int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p0 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
	p0 = new Scanner(System.in).nextLine();
	for (i = 0,j = 0; * (p0.Substring(i)) != '\0';i++)
	{
		if (*(p0.Substring(i)) != ' ' && *(p0.Substring(i) + 1) == ' ')
		{
			*(p1.Substring(j)) = *(p0.Substring(i));
			j++;
			*(p1.Substring(j)) = ' ';
			j++;
		}
	else if (*(p0.Substring(i)) != ' ' && *(p0.Substring(i) + 1) != ' ')
	{
		*(p1.Substring(j)) = *(p0.Substring(i));
		j++;
	}
		else
		{
			;
		}
	}
	*(p1.Substring(j)) = '\0';
	System.out.printf("%s",p1);
	return 0;
	}


}
