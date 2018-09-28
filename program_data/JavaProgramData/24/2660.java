package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int index = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		ConsoleInput.scanfRead(null, 1);
		String[] pS = null;
		String[] pS2 = null;
		String buffer = new String(new char[256]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * temp = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		pS = (String)malloc(sizeof(String) * n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		pS2 = (String)malloc(sizeof(String) * n);
		for (index = 0;index < n;index++)
		{
			temp = buffer;
			while ((*(temp++) = System.in.read()) != ' ')
			{
				if (*(temp - 1) == '\n')
				{
					break;
				}
			}

			*(temp - 1) = '\0';

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			pS[index] = (String)malloc(temp - buffer);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			pS2[index] = (String)malloc(temp - buffer);
			pS[index] = buffer;
			pS2[index] = buffer;
		}

		String intermedia = null;

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - 1;j++)
			{

				if (String.valueOf(pS[j]).length() < String.valueOf(pS[j + 1]).length())
				{
					intermedia = pS[j];
					pS[j] = pS[j + 1];
					pS[j + 1] = intermedia;
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (String.valueOf(pS2[j]).length() > String.valueOf(pS2[j + 1]).length())
				{
					intermedia = pS2[j];
					pS2[j] = pS2[j + 1];
					pS2[j + 1] = intermedia;
				}
			}
		}
		System.out.printf("%s\n%s",pS[0],pS2[0]);


		return 0;
	}
}

