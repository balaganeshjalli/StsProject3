package in.italent.request;

import java.util.List;

import org.springframework.stereotype.Component;

import in.italent.request.MessageRequest.AttachmentItem;
import in.italent.request.MessageRequest.Attachments;
import in.italent.request.MessageRequest.Board;

	 

	@Component

	public class MessageRequest {

	    private Data data;

	 

	    public Data getData() {

	        return data;

	    }

	 

	    public void setData(Data data) {

	        this.data = data;

	    }

	    

	    public static class Data {

	    	

	        private String type;

	        private String subject;

	        private String body;

	        private Board board;

	        private Attachments attachments;

	 

	        public String getType() {

	            return type;

	        }

	 

	        public void setType(String type) {

	            this.type = type;

	        }

	 

	        public String getSubject() {

	            return subject;

	        }

	 

	        public void setSubject(String subject) {

	            this.subject = subject;

	        }

	 

	        public String getBody() {

	            return body;

	        }

	 

	        public void setBody(String body) {

	            this.body = body;

	        }

	 

	        public Board getBoard() {

	            return board;

	        }

	 

	        public void setBoard(Board board) {

	            this.board = board;

	        }

	 

	        public Attachments getAttachments() {

	            return attachments;

	        }

	 

	        public void setAttachments(Attachments attachments) {

	            this.attachments = attachments;

	        }

	 

			@Override

			public String toString() {

				return "Data [type=" + type + ", subject=" + subject + ", body=" + body + ", board=" + board

						+ ", attachments=" + attachments + "]";

			}

	        

	        

	    }

	 

	    public static class Board {

	        private String id;

	 

	        public String getId() {

	            return id;

	        }

	 

	        public void setId(String id) {

	            this.id = id;

	        }

	 

			@Override

			public String toString() {

				return "Board [id=" + id + "]";

			}

	        

	    }

	 

	    public static class Attachments {

	        private String list_item_type;

	        private List<AttachmentItem> items;

	 

	        public String getList_item_type() {

	            return list_item_type;

	        }

	 

	        public void setList_item_type(String list_item_type) {

	            this.list_item_type = list_item_type;

	        }

	 

	        public List<AttachmentItem> getItems() {

	            return items;

	        }

	 

	        public void setItems(List<AttachmentItem> items) {

	            this.items = items;

	        }

	 

			@Override

			public String toString() {

				return "Attachments [list_item_type=" + list_item_type + ", items=" + items + "]";

			}

	        

	    }

	 

	    public static class AttachmentItem {

	        private String type;

	        private String field;

	 

	        public String getType() {

	            return type;

	        }

	 

	        public void setType(String type) {

	            this.type = type;

	        }

	 

	        public String getField() {

	            return field;

	        }

	 

	        public void setField(String field) {

	            this.field = field;

	        }

	 

			@Override

			public String toString() {

				return "AttachmentItem [type=" + type + ", field=" + field + "]";

			}

	        

	        

	    }

	 

		@Override

		public String toString() {

			return "Message [data=" + data + "]";

		}  


	}
	 
	

	


	

	
	

	




