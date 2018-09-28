package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int n;
		int i;
		int j;
		int point;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *lab=(char*)malloc(n *20 *sizeof(char));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	char lab = (String)malloc(n * 20 * (Character.SIZE / Byte.SIZE));
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			lab + i * 20 = Integer.parseInt(tempVar2);
		}
	}
	/*for(i=0;i<n;i++)
	    puts(lab+i*20);*/
	for (i = 0;i < n;i++)
	{

		for (j = 0,flag = 0; * (lab + 20 * i + j) != '\0';j++)
		{
			point = 20 * i + j;
			if (j == 0)
			{
				if (*(lab + point) == '_' || (*(lab + point) >= 'A' && *(lab + point) <= 'Z') || (*(lab + point) >= 'a' && *(lab + point) <= 'z'))
				{
					continue;
				}
					else
					{ //printf("%c\ni is %d\nj is %d\n",*(lab+point),i,j);
							flag = 1;
							break;
					}
			}
				else
				{
					if (!((*(lab + point) >= 'A' && *(lab + point) <= 'Z') || (*(lab + point) >= 'a' && *(lab + point) <= 'z')) && *(lab + point) != '_' && !(*(lab + point) >= '0' && *(lab + point) <= '9'))
					{ //printf("%c\ni is %d\nj is %d\n",*(lab+point),i,j);
							flag = 1;
							break;
					}
				}
		}
		// printf("flag is %d",flag);
		 if (flag != 0)
		 {
			System.out.print("no\n");
		 }
		 else
		 {
			System.out.print("yes\n");
		 }
	}
	return 0;
	}

}

