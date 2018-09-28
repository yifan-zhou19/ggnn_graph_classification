//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *strqp(char *);
char strqp = char * ;

int main()
{
	char[] buffer = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	buffer = new Scanner(System.in).nextLine();
	System.out.printf("%s\n",strqp(buffer));
	return 0;
}

char * strqp(char * str)
{
	int len;
	len = str.length();

	String qp;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	qp = (String)malloc(len + 1);
	int index = 0;
	for (index = 0;index < len - 1;index++)
	{
		qp = tangible.StringFunctions.changeCharacter(qp, index, (str[index] + str[index + 1]));
	}
	qp = tangible.StringFunctions.changeCharacter(qp, len - 1, str[len - 1] + str[0]);
	qp = tangible.StringFunctions.changeCharacter(qp, len, '\0');
	return qp;
}

