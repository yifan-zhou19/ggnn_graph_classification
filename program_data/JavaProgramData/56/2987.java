void change(char *);
int main()
{
	String p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p = (String)malloc(5 * (Character.SIZE / Byte.SIZE));
	p = new Scanner(System.in).nextLine();

	change(p);
}
void change(char * q)
{
	String q0 = q;
	if (*q == '\0')
	{
		System.out.print("\n");
	}
	else
	{
		for (; * q != '\0';q++)
		{
		}
		System.out.printf("%c",*(q - 1));
		*(q - 1) = '\0';
		change(q0);
	}
}
