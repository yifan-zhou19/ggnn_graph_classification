package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String input = new String(new char[20]);
		while (gets(input) != null)
		{
			String a = new String(new char[15]);
			String b = new String(new char[5]);
			sscanf(input,"%s %s",a,b);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * ptr = a;
			String insert = a;
			char temp = ptr;
			while (*(ptr) != '\0')
			{
				if (*(ptr) > temp)
				{
					temp = (ptr);
					insert = ptr;
				}
				ptr++;
			}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * move = ptr + 3;
			while (ptr != insert)
			{
				*move = ptr;
				move--;
				ptr--;
			}
			move = b;
			ptr++;
			while (*(move) != '\0')
			{
				*ptr = move;
				move++;
				ptr++;
			}
			System.out.printf("%s\n",a);
		}
	}
}
