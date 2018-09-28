import java.util.*;

void work(char*);
int main()
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 char * p; //????p?????????s
	 String s = new String(new char[101]);
	s = new Scanner(System.in).nextLine();
	p = s; //??????????p
	for (; * p != '\0'; p++) //????'\0'
	{
		if (*p == ' ') //???????
		{
			if (*(p + 1) == ' ') //??????????
			{
				work(p);
				p--;
			}
		}
	}
	p = s;
	System.out.print(p);
	return 0;
}
void work(char * p)
{
	for (;; p++)
	{
		*p = *(p + 1);
		if (*p == '\0')
		{
			break;
		}
	}
	return;
}
