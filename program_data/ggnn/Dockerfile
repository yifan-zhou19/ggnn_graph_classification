FROM yijun/fast:built
RUN apt-get update
RUN apt-get install -y python3-pip
RUN pip3 install flatbuffers
RUN pip3 install tqdm
ADD ggnn.py /opt/bin/ggnn
RUN chmod +x /opt/bin/ggnn
RUN cp -r /opt/* /usr/local/
ENTRYPOINT ["/usr/local/bin/ggnn"]
