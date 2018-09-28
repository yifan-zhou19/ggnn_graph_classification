package <missing>;

public class GlobalMembers
{
	public static int check(char c)
	{
		int r;
		if (c != ' ')
		{
			r = 0;
		}
		else
		{
			r = 1;
		}
		return r;
	}

	public static void Main()
	{
		int check = char c;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String a = new String(new char[1024]);
		char[][] word = new char[100][100];
		int i = 0;
		int j = 0;
		int k;
		a = new Scanner(System.in).nextLine();
		p = a;
		while (*p != null)
		{
			while (check(*p) != 0 && p != '\0')
			{
				p++;
			}
			if (*p == '\0')
			{
				break;
			}
			sscanf(p,"%[!-?0-9:-@A-Za-z']",word[i]); //??????????
			for (j = 0;word[i][j] != '\0';j++)
			{
				; //word??????
			}
			p += j;
			i++;

		}
		for (j = 0;word[0][j] != '\0';j++)
		{
			; //j????
		}
		   System.out.printf("%d",j);
		for (k = 1;k < i;k++)
		{
			for (j = 0;word[k][j] != '\0';j++)
			{
				;
			}
			System.out.printf(",%d",j);
		}



	}

}
