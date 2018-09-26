package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
	int n;
	int i;
	int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *lab=(char*)malloc(n *32 *sizeof(char));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	char lab = (String)malloc(n * 32 * (Character.SIZE / Byte.SIZE));
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			lab + i * 32 = Integer.parseInt(tempVar2);
		}
	}
	for (i = 0;i < n;i++)
	{

		for (j = 0; * (lab + 32 * i + j) != '\0';j++)
		{
		if (strcmp(lab + 32 * i + j,"er") == 0 || strcmp(lab + 32 * i + j,"ly") == 0 || strcmp(lab + 32 * i + j,"ing") == 0)
		{
			*(lab + 32 * i + j) = '\0';
			break;
		}
		}
	}
	for (i = 0;i < n;i++)
	{
		System.out.println(lab + 32 * i);
	}
	return 0;
	}

}

